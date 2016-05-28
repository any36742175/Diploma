package ann.project.systemmonitoring.repository;

import ann.project.systemmonitoring.entity.imp.SharedMemoryImp;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface SharedMemoryRepository extends CrudRepository<SharedMemoryImp, Long> {

    Page<SharedMemoryImp> findAll(Pageable pageable);
}
