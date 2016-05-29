package ann.project.systemmonitoring.system.datageneration.imp;

import ann.project.systemmonitoring.entity.imp.TCPConnectionImp;
import ann.project.systemmonitoring.system.datageneration.DataGenerate;
import ann.project.systemmonitoring.system.datageneration.consts.ConstTCPConnection;

import java.util.Objects;
import java.util.Random;


public class DataGeneratorTCPConnection implements DataGenerate<TCPConnectionImp> {

    private Random random = new Random();


    @Override
    public TCPConnectionImp generateData() {
        TCPConnectionImp data = new TCPConnectionImp();
        data.setProcess("Pr[" + random.nextInt(10000) + "].exe");
        data.setLocalAddress(random.nextInt(255) + "." + random.nextInt(255) + "." + random.nextInt(255) + "." + random.nextInt(255) + " :" + random.nextInt(65535));
        data.setRemoteAddress(random.nextInt(255) + "." + random.nextInt(255) + "." + random.nextInt(255) + "." + random.nextInt(255) + " :" + random.nextInt(65535));
        while (Objects.equals(data.getLocalAddress(), data.getRemoteAddress())) {
            data.setRemoteAddress(random.nextInt(255) + "." + random.nextInt(255) + "." + random.nextInt(255) + "." + random.nextInt(255) + " :" + random.nextInt(65535));
        }
        data.setState(ConstTCPConnection.states.get(random.nextInt(ConstTCPConnection.states.size())));
        return data;

    }
}
