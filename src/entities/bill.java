package entities;

public class bill {
	private char gender; // 'F' para feminino, 'M' para masculino
    private int beer; // quantidade de cervejas
    private int softDrink; // quantidade de refrigerantes
    private int barbecue; // quantidade de espetinhos
    
	public bill(char gender, int beer, int softDrink, int barbecue) {
		this.gender = gender;
		this.beer = beer;
		this.softDrink = softDrink;
		this.barbecue = barbecue;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getBeer() {
		return beer;
	}

	public void setBeer(int beer) {
		this.beer = beer;
	}

	public int getSoftDrink() {
		return softDrink;
	}

	public void setSoftDrink(int softDrink) {
		this.softDrink = softDrink;
	}

	public int getBarbecue() {
		return barbecue;
	}

	public void setBarbecue(int barbecue) {
		this.barbecue = barbecue;
	}

	public double ticket() {
		if (gender == 'F') {
            return 8;
        }
		else if (gender == 'M') {
            return 10;
        }
		else {
            // Se o gênero for inválido, retornamos 0 ou poderíamos lançar uma exceção
            return 0;
        }
	}
	
	public double feeding() {
        return (this.beer * 5) + (this.softDrink * 3) + (this.barbecue * 7);
    }
    
	// Método para calcular o valor do couvert, se aplicável
	public double cover() {
        if (feeding() > 30) {
            return 4;
        } else {
            return 0;
        }
    }
	
	// Método para calcular o valor total da conta
    public double total() {
        return ticket() + feeding() + cover();
    }
    
    public String toString() {
    	return "Valor a Pagar: "
    			+ String.format("%.2f", total());
    }
}
