package ann.project.systemmonitoring.repository;

import ann.project.systemmonitoring.entity.imp.IPCQueueImp;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

/**
 * Интерефейс, который реализует spring контейнер.
 * Служит для выполнения crud операция с указанным классом(entity) IPCQueueImp
 */
public interface IPCQueueRepository extends CrudRepository<IPCQueueImp, Long> {

    Page<IPCQueueImp> findAll(Pageable pageable);

}
