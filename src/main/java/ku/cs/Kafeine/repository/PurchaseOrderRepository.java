package ku.cs.Kafeine.repository;

import ku.cs.Kafeine.entity.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PurchaseOrderRepository
        extends JpaRepository<PurchaseOrder, UUID> {
}
