package ann.project.systemmonitoring.datageneration.imp;

import ann.project.systemmonitoring.datageneration.DataGenerate;
import ann.project.systemmonitoring.entity.Semaphore;

import java.util.Date;
import java.util.Random;


public class DataGeneratorSemaphores implements DataGenerate<Semaphore> {

    @Override
    public Semaphore generateData() {
        Semaphore data = new Semaphore();
        Random random = new Random();
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
