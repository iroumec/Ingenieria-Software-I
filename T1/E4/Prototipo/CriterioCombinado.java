public abstract class CriterioCombinado extends CriterioBusqueda {
    protected CriterioBusqueda primerCriterio;
    protected CriterioBusqueda segundoCriterio;

    public CriterioCombinado(CriterioBusqueda primer, CriterioBusqueda segundo) {
        this.primerCriterio = primer;
        this.segundoCriterio = segundo;
    }
}
