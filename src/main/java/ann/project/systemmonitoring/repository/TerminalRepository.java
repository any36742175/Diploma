package ann.project.systemmonitoring.repository;

import ann.project.systemmonitoring.entity.IPCQueue;
import ann.project.systemmonitoring.entity.Terminal;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface TerminalRepository extends CrudRepository<Terminal, Long> {

    Page<Terminal> findAll(Pageable pageable);

}
