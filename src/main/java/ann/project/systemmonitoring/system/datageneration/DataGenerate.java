package ann.project.systemmonitoring.system.datageneration;


/**
 * Интерфейс для генерации классов указанного типа
 */
public interface DataGenerate<V> {
    public V generateData();
}
