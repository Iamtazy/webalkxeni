package webalkxeni.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="Kolcsonzes")
public class Kolcsonzes {

	@Id
	@Column(name="kolcsonzesID", nullable = false)
	@NotNull
	@GeneratedValue
	private int kolcsonzesID;
	@Column(name="db")
	private int db;
	@Column(name="datum")
	private Date datum;
	@ManyToOne
	private Olvaso okodfk;
	@OneToMany(mappedBy="kolcsIDfk")
	private List<Konyv> konyv;

	
	protected Kolcsonzes() {
		
	}


	public Kolcsonzes(int kolcsonzesID, int db, Date datum) {
		super();
		this.kolcsonzesID = kolcsonzesID;
		this.db = db;
		this.datum = datum;
	}


	public int getKolcsonzesID() {
		return kolcsonzesID;
	}


	public void setKolcsonzesID(int kolcsonzesID) {
		this.kolcsonzesID = kolcsonzesID;
	}


	public int getDb() {
		return db;
	}


	public void setDb(int db) {
		this.db = db;
	}


	public Date getDatum() {
		return datum;
	}


	public void setDatum(Date datum) {
		this.datum = datum;
	}


	public Olvaso getOkodfk() {
		return okodfk;
	}


	public void setOkodfk(Olvaso okodfk) {
		this.okodfk = okodfk;
	}


	public List<Konyv> getKonyv() {
		return konyv;
	}


	public void setKonyv(List<Konyv> konyv) {
		this.konyv = konyv;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		result = prime * result + db;
		result = prime * result + kolcsonzesID;
		result = prime * result + ((konyv == null) ? 0 : konyv.hashCode());
		result = prime * result + ((okodfk == null) ? 0 : okodfk.hashCode());
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
		Kolcsonzes other = (Kolcsonzes) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (db != other.db)
			return false;
		if (kolcsonzesID != other.kolcsonzesID)
			return false;
		if (konyv == null) {
			if (other.konyv != null)
				return false;
		} else if (!konyv.equals(other.konyv))
			return false;
		if (okodfk == null) {
			if (other.okodfk != null)
				return false;
		} else if (!okodfk.equals(other.okodfk))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Kolcsonzes [kolcsonzesID=" + kolcsonzesID + ", db=" + db + ", datum=" + datum + ", okodfk=" + okodfk
				+ ", konyv=" + konyv + "]";
	}
	
	

}
