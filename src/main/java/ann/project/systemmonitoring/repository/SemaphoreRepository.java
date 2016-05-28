package ann.project.systemmonitoring.repository;

import ann.project.systemmonitoring.entity.imp.SemaphoreImp;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface SemaphoreRepository extends CrudRepository<SemaphoreImp, Long> {

    Page<SemaphoreImp> findAll(Pageable pageable);


}
