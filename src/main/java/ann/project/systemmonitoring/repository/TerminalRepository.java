package ann.project.systemmonitoring.repository;

import ann.project.systemmonitoring.entity.imp.TerminalImp;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

/**
 * Интерефейс, который реализует spring контейнер.
 * Служит для выполнения crud операция с указанным классом(entity) TerminalImp
 */
public interface TerminalRepository extends CrudRepository<TerminalImp, Long> {

    Page<TerminalImp> findAll(Pageable pageable);

}
