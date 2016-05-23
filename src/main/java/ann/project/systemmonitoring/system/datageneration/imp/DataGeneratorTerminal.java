package ann.project.systemmonitoring.system.datageneration.imp;

import ann.project.systemmonitoring.entity.IPCQueue;
import ann.project.systemmonitoring.entity.Terminal;
import ann.project.systemmonitoring.system.datageneration.DataGenerate;

import java.util.Date;
import java.util.Random;


public class DataGeneratorTerminal implements DataGenerate<Terminal> {

    private Random random = new Random();

    @Override
    public Terminal generateData() {
        Terminal data = new Terminal();
        data.setTerminalID("" + random.nextInt(10)+ random.nextInt(10)+ random.nextInt(10)+ random.nextInt(10)+ random.nextInt(10));
        data.setTerminalType("ATM");//todo
        //data.setCurrentNode(Integer.valueOf(Integer.toString(random.nextInt(3)+9),2));
        data.setCurrentNode(random.nextInt(3)+9);
        //data.setPreviousNode(Integer.valueOf(Integer.toString(random.nextInt(3)+9),2));
        data.setPreviousNode(random.nextInt(3)+9);

        java.text.SimpleDateFormat sdf =
                new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        data.setConnetcionTime(sdf.format(new Date()));//todo - 1m
        data.setOwningNodes("" + data.getCurrentNode() + "; " + data.getPreviousNode());//todo random
        data.setStatuses("Not Active");//todo random
        return data;

    }
}
