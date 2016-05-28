package ann.project.systemmonitoring.repository;

import ann.project.systemmonitoring.entity.imp.IPCQueue;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface IPCQueueRepository extends CrudRepository<IPCQueue, Long> {

    Page<IPCQueue> findAll(Pageable pageable);

}
