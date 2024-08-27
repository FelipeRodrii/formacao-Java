package arvoreBinaria;

import arvoreBinaria.noArvore.NoArvore;

// Arvore de um tipo Generico(T), esse tipo que irá implementar um Comparable
public class ArvoreBinaria <T extends Comparable<T>>{

    // Raiz, variável que demarca a base de nossa árvore(o primeiro item que adicionarmos nela).
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
            // Recursão, o método se chama a cada verificação, mudando o valor de 'atual', até rlr drt null.
        }else if(novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        }else{
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }
        return atual; // Retorna toda a árvore no final par atualizar a raiz.
    }

    public void exibirInOrdem(){
        System.out.print("\n Exibindo InOrdem: ");
        exibirInOrdem(this.raiz);
    }

    // Exibição em ordem, do mais a esquerda aos mais a direita, sendo, filho esquerda, pai e filhos esquerdos
    // do filho direito e direito a ordem começando sempre do que se encontrar mais a esquerdade  todos.
    private void exibirInOrdem(NoArvore<T> atual){
        if(atual != null){
            exibirInOrdem(atual.getNoEsq());
            System.out.print(atual.getConteudo()+ ", ");
            exibirInOrdem(atual.getNoDir());
        }
    }

    // Exibe a nossa árvore primeiro pelos filhos e depois os pais
    public void exibirPostOrdem(){
        System.out.print("\n Exibindo PostOrdem: ");
        exibirPostOrdem(this.raiz);
    }

    // Exibe a árvore mostrando os filhos e os pais, esquerda para a direita.
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

    // Ordem natural,exibi os pais e em seguída os filhos, da esquerda e depois direita
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

            // Loop para achar o valor que desejamos remover
            while (atual != null && !atual.getConteudo().equals(conteudo)){
                pai = atual;
                if(conteudo.compareTo(atual.getConteudo()) < 0){
                    atual = atual.getNoEsq();
                }else {
                    atual = atual.getNoDir();
                }
            }
            // Mensagem caso o conteudo que queremos remover não exista
            if(atual == null){
                System.out.println("Conteudo nao encontrado. Bloco Try");
            }
            // Caso de o conteudo que queremos remover seja a raiz da árvore, iremos verificar se os filhos esquerdo
            // e ou direito são vazios.
            if(pai == null){
                if(atual.getNoDir() == null){
                    this.raiz = atual.getNoEsq();
                }else if(atual.getNoEsq() == null){
                    this.raiz = atual.getNoDir();

                }else{
                    // Busca o maior valor na sub-árvore esquerda da raiz.
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
