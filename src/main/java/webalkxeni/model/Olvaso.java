package webalkxeni.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="Olvaso")
public class Olvaso {

	@Id
	@Column(name="okod", nullable = false)
	@NotNull
	private int okod;
	@Column(name="nev")
	private String nev;
	@Column(name="lakcim")
	private String lakcim;
	@OneToMany(mappedBy="olvaso")
	private List<Kolcsonzes> kolcsonzes;
		
	protected Olvaso() {
		
	}

	public Olvaso(int okod, String nev, String lakcim, List<Kolcsonzes> kolcsonzes) {
		super();
		this.okod = okod;
		this.nev = nev;
		this.lakcim = lakcim;
		this.kolcsonzes = kolcsonzes;
	}

	public int getOkod() {
		return okod;
	}

	public void setOkod(int okod) {
		this.okod = okod;
	}

	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public String getLakcim() {
		return lakcim;
	}

	public void setLakcim(String lakcim) {
		this.lakcim = lakcim;
	}

	public List<Kolcsonzes> getKolcsonzes() {
		return kolcsonzes;
	}

	public void setKolcsonzes(List<Kolcsonzes> kolcsonzes) {
		this.kolcsonzes = kolcsonzes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kolcsonzes == null) ? 0 : kolcsonzes.hashCode());
		result = prime * result + ((lakcim == null) ? 0 : lakcim.hashCode());
		result = prime * result + ((nev == null) ? 0 : nev.hashCode());
		result = prime * result + okod;
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
		Olvaso other = (Olvaso) obj;
		if (kolcsonzes == null) {
			if (other.kolcsonzes != null)
				return false;
		} else if (!kolcsonzes.equals(other.kolcsonzes))
			return false;
		if (lakcim == null) {
			if (other.lakcim != null)
				return false;
		} else if (!lakcim.equals(other.lakcim))
			return false;
		if (nev == null) {
			if (other.nev != null)
				return false;
		} else if (!nev.equals(other.nev))
			return false;
		if (okod != other.okod)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Olvaso [okod=" + okod + ", nev=" + nev + ", lakcim=" + lakcim + ", kolcsonzes=" + kolcsonzes + "]";
	}

	
}
