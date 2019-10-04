package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Theater")
public class theater {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="theater_id")
	private int id;
	@Column(name = "theater_name")
	private String theatername;
	
	@Override
	public String toString() {
		return "theater [id=" + id + ", theatername=" + theatername + "]";
	}
	public theater() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public theater(int id, String theatername) {
		super();
		this.id = id;
		this.theatername = theatername;
	}
	public theater(String theatername) {
		super();
		this.theatername = theatername;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTheatername() {
		return theatername;
	}
	public void setTheatername(String theatername) {
		this.theatername = theatername;
	}
	
	
}
