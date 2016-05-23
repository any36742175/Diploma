package ann.project.systemmonitoring.system.datageneration.imp;

import ann.project.systemmonitoring.entity.IPCQueue;
import ann.project.systemmonitoring.system.datageneration.DataGenerate;

import java.util.Date;
import java.util.Random;


public class DataGeneratorIPCQueue implements DataGenerate<IPCQueue> {

    private Random random = new Random();

    @Override
    public IPCQueue generateData() {
        IPCQueue data = new IPCQueue();
        data.setQueueId("" + random.nextInt(10)+ random.nextInt(10)+ random.nextInt(10)+ random.nextInt(10));
        data.setPermission("–rw-r----");
        data.setQueueSize(random.nextInt(99999999 - 1000000) + 1000000);
        data.setMessages("" + random.nextInt(99-1)+1);

        java.text.SimpleDateFormat sdf =
                new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        data.setLastOperation(sdf.format(new Date()));//todo - 1m
        data.setQueueType("HSM messages");//todo random
        data.setOWNER("txrout");//todo random
        return data;

    }
}
