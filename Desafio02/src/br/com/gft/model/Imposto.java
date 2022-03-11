package br.com.gft.model;

public interface Imposto {
	
	public double calcularImposto();
}

/*for (Livro l: livro){
	if (l.equals("educativo")) {
		return 0;
	} else {
		l.setPreco(1.1*l.getPreco());
		return l.getPreco();
	}
}

for(VideoGame v: videoGame) {
	if(v.isUsado()) {
		v.setPreco(1.25*v.getPreco());
	} else {
		v.setPreco(1.45*v.getPreco());
	}
}
return 0;*/