package ann.project.systemmonitoring.repository;

import ann.project.systemmonitoring.entity.SharedMemory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface SharedMemoryRepository extends CrudRepository<SharedMemory, Long> {

    Page<SharedMemory> findAll(Pageable pageable);
}
