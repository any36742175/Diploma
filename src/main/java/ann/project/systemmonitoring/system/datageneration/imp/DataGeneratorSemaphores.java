package ann.project.systemmonitoring.system.datageneration.imp;

import ann.project.systemmonitoring.system.datageneration.DataGenerate;
import ann.project.systemmonitoring.entity.Semaphore;

import java.util.Date;
import java.util.Random;


public class DataGeneratorSemaphores implements DataGenerate<Semaphore> {

    private Random random = new Random();

    @Override
    public Semaphore generateData() {
        Semaphore data = new Semaphore();

        data.setKey(random.nextInt(100) + 1000);
        data.setShm_id(random.nextInt(99999 - 10000) + 10000);
        data.setPermission("–rw-r----");
        data.setSemPerKey(random.nextInt(99 - 1) + 1);

        java.text.SimpleDateFormat sdf =
                new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        data.setLastChange(sdf.format(new Date()));//todo - 1m
        data.setLastOperation(sdf.format(new Date()));//todo - 1m
        data.setType("IPC queue list");//todo random
        data.setOWNER("SVFE");//todo random
        return data;

    }
}
