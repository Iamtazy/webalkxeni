package webalkxeni.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="Konyv")
public class Konyv {

	@Id
	@Column(name="kkod", nullable = false)
	@NotNull 
	private int kkod;
	@Column(name="szerzo")
	private String szerzo;
	@Column(name="cim")
	private String cim;
	@ManyToOne
	@JoinColumn(name="kolcsonzes_id", nullable = false)
	private Kolcsonzes kolcsonzes;
	
	protected Konyv()  {
		
	}

	public Konyv(int kkod, String szerzo, String cim, Kolcsonzes kolcsonzes) {
		super();
		this.kkod = kkod;
		this.szerzo = szerzo;
		this.cim = cim;
		this.kolcsonzes = kolcsonzes;
	}

	public int getKkod() {
		return kkod;
	}

	public void setKkod(int kkod) {
		this.kkod = kkod;
	}

	public String getSzerzo() {
		return szerzo;
	}

	public void setSzerzo(String szerzo) {
		this.szerzo = szerzo;
	}

	public String getCim() {
		return cim;
	}

	public void setCim(String cim) {
		this.cim = cim;
	}

	public Kolcsonzes getKolcsonzes() {
		return kolcsonzes;
	}

	public void setKolcsonzes(Kolcsonzes kolcsonzes) {
		this.kolcsonzes = kolcsonzes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cim == null) ? 0 : cim.hashCode());
		result = prime * result + kkod;
		result = prime * result + ((kolcsonzes == null) ? 0 : kolcsonzes.hashCode());
		result = prime * result + ((szerzo == null) ? 0 : szerzo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Konyv other = (Konyv) obj;
		if (cim == null) {
			if (other.cim != null)
				return false;
		} else if (!cim.equals(other.cim))
			return false;
		if (kkod != other.kkod)
			return false;
		if (kolcsonzes == null) {
			if (other.kolcsonzes != null)
				return false;
		} else if (!kolcsonzes.equals(other.kolcsonzes))
			return false;
		if (szerzo == null) {
			if (other.szerzo != null)
				return false;
		} else if (!szerzo.equals(other.szerzo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Konyv [kkod=" + kkod + ", szerzo=" + szerzo + ", cim=" + cim + ", kolcsonzes=" + kolcsonzes + "]";
	}

	
	
}
