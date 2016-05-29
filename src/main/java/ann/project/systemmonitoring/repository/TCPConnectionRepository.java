package ann.project.systemmonitoring.repository;

import ann.project.systemmonitoring.entity.imp.TCPConnectionImp;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

/**
 * Интерефейс, который реализует spring контейнер.
 * Служит для выполнения crud операция с указанным классом(entity) TCPConnectionImp
 */
public interface TCPConnectionRepository extends CrudRepository<TCPConnectionImp, Long> {

    Page<TCPConnectionImp> findAll(Pageable pageable);
}
