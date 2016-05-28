package ann.project.systemmonitoring.system.datageneration.imp;

import ann.project.systemmonitoring.entity.imp.IPCQueue;
import ann.project.systemmonitoring.system.datageneration.DataGenerate;
import ann.project.systemmonitoring.system.datageneration.consts.ConstIPCQueue;

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
        data.setMessages(random.nextInt(99-1)+1);

        java.text.SimpleDateFormat sdf =
                new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        data.setLastOperation((sdf.format(new Date(java.lang.System.currentTimeMillis() - 1000 * 60))));
        data.setType(ConstIPCQueue.types.get(random.nextInt(ConstIPCQueue.types.size())));
        if (data.getType().equals("")) {
            data.setOWNER("");
        } else {
            data.setOWNER(ConstIPCQueue.owners.get(random.nextInt(ConstIPCQueue.owners.size() - 1)));
        }
        return data;

    }
}
