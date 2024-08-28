import java.util.*;

public class ControlePresenca {
    Set<Participante> listaPresenca = new HashSet<>();

    public void adicionarParticipante(String nome, int idade, int id){
        listaPresenca.add(new Participante(nome, idade, id));
    }

    public void removerParticipantePorID(int id){
        Iterator<Participante> iterador = listaPresenca.iterator();
        while(iterador.hasNext()) {
            if (iterador.next().getId() == id) {
                iterador.remove();
                break;
            }
        }
    }
    public Set<Participante> getListaPresenca() {
        return listaPresenca;
    }

    public List<Participante> verificarPresencaPorNome(String nome){
        List<Participante> opcoes = new ArrayList<>();
        for (Participante participante: listaPresenca)
            if (participante.getNome().equals(nome))
                opcoes.add(participante);
        return opcoes;
    }

    public Participante recuperarParticipantePorID(int id){
        Participante participante= null;
        for (Participante p: listaPresenca){
            if (p.getId() == id){
                participante = p;
                break;
            }
        }
        return participante;
    }
    public String listarParticipanteNomeID(){
        String retorno="";
        for (Participante p: listaPresenca ){
            retorno += "Nome: "+p.getNome() + " ID: " + p.getId() + "\n";
        }
        return retorno;
    }
}
