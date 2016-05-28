package ann.project.systemmonitoring.system.datageneration.imp;

import ann.project.systemmonitoring.entity.imp.Terminal;
import ann.project.systemmonitoring.system.datageneration.consts.ConstTerminal;
import ann.project.systemmonitoring.system.datageneration.DataGenerate;

import java.util.Date;
import java.util.Random;


public class DataGeneratorTerminal implements DataGenerate<Terminal> {

    private Random random = new Random();


    @Override
    public Terminal generateData() {
        Terminal data = new Terminal();
        data.setTerminalID("" + random.nextInt(10)+ random.nextInt(10)+ random.nextInt(10)+ random.nextInt(10)+ random.nextInt(10));
        data.setTerminalType(ConstTerminal.terminalTypes.get(random.nextInt(ConstTerminal.terminalTypes.size())));
        data.setCurrentNode(Integer.toString(random.nextInt(3)+9, 2));
        //data.setCurrentNode(random.nextInt(3)+9);
        //data.setPreviousNode(Integer.valueOf(Integer.toString(random.nextInt(3)+9),2));
        data.setPreviousNode(Integer.toString(random.nextInt(3)+9,2));

        java.text.SimpleDateFormat sdf =
                new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        data.setConnetcionTime(sdf.format(new Date(java.lang.System.currentTimeMillis() - 1000*60)));
        data.setOwningNodes("" + data.getCurrentNode() + "; " + data.getPreviousNode());
        data.setStatus(ConstTerminal.terminalStatuses.get(random.nextInt(ConstTerminal.terminalStatuses.size())));
        return data;

    }
}
