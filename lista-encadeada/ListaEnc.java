public class ListaEnc<TIPO extends Comparable<TIPO>> extends Lista<TIPO> {

	@Override
	public void adicionarFim(TIPO elemento) throws Exception {
		throw new Exception("N�o implementado");
	}

	@Override
	public void adicionarInicio(TIPO elemento) throws Exception {
		throw new Exception("N�o implementado");
	}

	@Override
	public void adicionar(TIPO elemento, int posicao) throws Exception {
		throw new Exception("N�o implementado");
	}

	@Override
	public TIPO get(int posicao) throws Exception {
		throw new Exception("Posi��o solicitada n�o existe na lista");
	}

	@Override
	public int getPos(TIPO elemento) throws Exception {
		throw new Exception("Elemento n�o localizado");
	}

	@Override
	public void remover(int posicao) throws Exception {
		throw new Exception("N�o implementado");
	}

	@Override
	public void limpar() {
	}

	@Override
	public int getTamanho() {
		return 0;
	}

	@Override
	public boolean contem(TIPO elemento) throws Exception {
		 throw new Exception("N�o implementado");
	}
	
}
