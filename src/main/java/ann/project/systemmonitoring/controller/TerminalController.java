package ann.project.systemmonitoring.controller;

import ann.project.systemmonitoring.entity.imp.TerminalImp;
import ann.project.systemmonitoring.repository.TerminalRepository;
import ann.project.systemmonitoring.util.DateTime;
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
    public List<TerminalImp> getTerminal() {
        Iterator<TerminalImp> iterator = terminalRepository.findAll().iterator();
        List<TerminalImp> terminalImpList = new ArrayList<>();
        while (iterator.hasNext()) {
            terminalImpList.add(iterator.next());
        }
        return terminalImpList;
    }

    @ModelAttribute("dateTime")
    public String dateTime() {
        return DateTime.getCurrentDateTimeFormate();
    }
}
