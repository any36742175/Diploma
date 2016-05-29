package ann.project.systemmonitoring.util.sharedmemory;

/**
 * Класс которые содержит информацию о type и owner.
 * Используется при поиске повторений по этим полям в SemaphoreUtils и SharedMemoryUtils.
 */
public class EmptyTypeOwner {
    private String type;
    private String owner;

    public EmptyTypeOwner(String type, String owner) {
        this.type = type;
        this.owner = owner;
    }

    public String getType() {
        return type;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmptyTypeOwner that = (EmptyTypeOwner) o;

        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        return owner != null ? owner.equals(that.owner) : that.owner == null;

    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        return result;
    }
}
