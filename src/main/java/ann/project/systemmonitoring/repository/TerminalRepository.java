package ann.project.systemmonitoring.repository;

import ann.project.systemmonitoring.entity.imp.TerminalImp;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface TerminalRepository extends CrudRepository<TerminalImp, Long> {

    Page<TerminalImp> findAll(Pageable pageable);

}
