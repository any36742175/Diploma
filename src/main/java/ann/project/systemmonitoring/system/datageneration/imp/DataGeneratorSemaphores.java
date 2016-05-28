package ann.project.systemmonitoring.system.datageneration.imp;

import ann.project.systemmonitoring.entity.imp.SemaphoreImp;
import ann.project.systemmonitoring.system.datageneration.DataGenerate;
import ann.project.systemmonitoring.system.datageneration.consts.ConstSemaphore;

import java.util.Date;
import java.util.Random;


public class DataGeneratorSemaphores implements DataGenerate<SemaphoreImp> {

    private Random random = new Random();

    @Override
    public SemaphoreImp generateData() {
        SemaphoreImp data = new SemaphoreImp();

        data.setKey(random.nextInt(100) + 1000);
        data.setShm_id(random.nextInt(99999 - 10000) + 10000);
        data.setPermission("–rw-r----");
        data.setSemPerKey(random.nextInt(99 - 1) + 1);

        java.text.SimpleDateFormat sdf =
                new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        data.setLastChange(sdf.format(new Date(java.lang.System.currentTimeMillis() - 1000 * 60)));
        data.setLastOperation(sdf.format(new Date(java.lang.System.currentTimeMillis() - 1000 * 60 * 2)));
        data.setType(ConstSemaphore.types.get(random.nextInt(ConstSemaphore.types.size())));
        data.setOWNER(ConstSemaphore.owners.get(random.nextInt(ConstSemaphore.owners.size())));
        return data;

    }
}
