package arvoreBinaria;

import arvoreBinaria.noArvore.NoArvore;

public class ArvoreBinaria <T extends Comparable<T>>{

    private NoArvore<T> raiz;

    public ArvoreBinaria(){
        this.raiz= null;
    }

    public void inserir(T conteudo){
        NoArvore<T> novoNo = new NoArvore<>(conteudo);
        raiz = inserir(raiz, novoNo);
    }

    private NoArvore<T> inserir(NoArvore<T> atual, NoArvore<T> novoNo){
        if(atual == null){
            return novoNo;
        }else if(novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        }else{
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }
        return atual;
    }

    public void exibirInOrdem(){
        System.out.print("\n Exibindo InOrdem: ");
        exibirInOrdem(this.raiz);
    }

    private void exibirInOrdem(NoArvore<T> atual){
        if(atual != null){
            exibirInOrdem(atual.getNoEsq());
            System.out.print(atual.getConteudo()+ ", ");
            exibirInOrdem(atual.getNoDir());
        }
    }

    public void exibirPostOrdem(){
        System.out.print("\n Exibindo PostOrdem: ");
        exibirPostOrdem(this.raiz);
    }

    private void exibirPostOrdem(NoArvore<T> atual){
        if(atual != null){
            exibirPostOrdem(atual.getNoEsq());
            exibirPostOrdem(atual.getNoDir());
            System.out.print(atual.getConteudo()+ ", ");
        }
    }

    public void exibirPreOrdem(){
        System.out.print("\n Exibindo PreOrdem: ");
        exibirPreOrdem(this.raiz);

    }

    private void exibirPreOrdem(NoArvore<T> atual){
        if (atual != null){
            System.out.print(atual.getConteudo() + ", ");
            exibirPreOrdem(atual.getNoEsq());
            exibirPreOrdem(atual.getNoDir());
        }
    }

    public void remover(T conteudo){
        try{
            NoArvore<T> atual = this.raiz;
            NoArvore<T> pai = null;
            NoArvore<T> filho = null;
            NoArvore<T> temp = null;

            while (atual != null && !atual.getConteudo().equals(conteudo)){
                pai = atual;
                if(conteudo.compareTo(atual.getConteudo()) < 0){
                    atual = atual.getNoEsq();
                }else {
                    atual = atual.getNoDir();
                }
            }
            if(atual == null){
                System.out.println("Conteudo nao encontrado. Bloco Try");
            }
            if(pai == null){
                if(atual.getNoDir() == null){
                    this.raiz = atual.getNoEsq();
                }else if(atual.getNoEsq() == null){
                    this.raiz = atual.getNoDir();

                }else {
                    for(temp = atual, filho = atual.getNoEsq();
                        filho.getNoDir() != null;
                        temp = filho, filho = filho.getNoEsq()

                    ){

                        if(filho != atual.getNoEsq()){
                            temp.setNoDir(filho.getNoEsq());
                            filho.setNoEsq(raiz.getNoEsq());
                        }
                    }
                    filho.setNoDir(raiz.getNoDir());
                    raiz = filho;
                }

            }else if(atual.getNoDir() == null){
                if(pai.getNoEsq() == atual){
                    pai.setNoEsq(atual.getNoEsq());
                }else {
                    pai.setNoDir(atual.getNoEsq());
                }

            }else if(atual.getNoEsq() == null){
                if(pai.getNoEsq() == atual){
                    pai.setNoEsq(atual.getNoDir());
                }else {
                    pai.setNoDir(atual.getNoDir());
                }

            }else{
                for(
                        temp = atual, filho = atual.getNoEsq();
                        filho.getNoDir() != null;
                        temp = filho, filho = filho.getNoDir()

                ){
                    if(filho != atual.getNoEsq()){
                        temp.setNoDir(filho.getNoEsq());
                        filho.setNoEsq(atual.getNoEsq());
                    }

                    filho.setNoDir(atual.getNoDir());

                    if(pai.getNoEsq() == atual){
                        pai.setNoEsq(filho);
                    }else{
                        pai.setNoDir(filho);
                    }
                }
            }
        }catch (NullPointerException erro){

            System.out.println("Conteudo nao encontrado. Bloco Catch");
        }
    }


}
