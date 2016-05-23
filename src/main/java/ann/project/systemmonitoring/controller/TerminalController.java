package ann.project.systemmonitoring.controller;

import ann.project.systemmonitoring.entity.IPCQueue;
import ann.project.systemmonitoring.entity.Terminal;
import ann.project.systemmonitoring.repository.IPCQueueRepository;
import ann.project.systemmonitoring.repository.TerminalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
public class TerminalController {

    @Autowired
    private TerminalRepository terminalRepository;

    @RequestMapping("/getTerminal")
    public String index() {
        return "getTerminal";
    }

    @ModelAttribute("terminalList")
    public List<Terminal> getTerminal() {
        Iterator<Terminal> iterator = terminalRepository.findAll().iterator();
        List<Terminal> terminalList = new ArrayList<>();
        while (iterator.hasNext()){
            terminalList.add(iterator.next());
        }
        return terminalList;
    }
}
