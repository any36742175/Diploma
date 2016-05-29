package ann.project.systemmonitoring.repository;

import ann.project.systemmonitoring.entity.imp.SemaphoreImp;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

/**
 * Интерефейс, который реализует spring контейнер.
 * Служит для выполнения crud операция с указанным классом(entity) SemaphoreImp
 */
public interface SemaphoreRepository extends CrudRepository<SemaphoreImp, Long> {

    Page<SemaphoreImp> findAll(Pageable pageable);


}
