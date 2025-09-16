package maquinaria;

import java.util.Arrays;

import personal.Maquinista;

public class Trenes {
	private Locomotoras locomotora;
	private Vagones[] vagones = new Vagones[5];
	private Maquinista maquinista;

	public Locomotoras getLocomotora() {
		return locomotora;
	}

	public void setLocomotora(Locomotoras locomotora) {
		this.locomotora = locomotora;
	}

	public Vagones[] getVagones() {
		return vagones;
	}

	public void setVagones(Vagones[] vagones) {
		this.vagones = vagones;
	}

	public Maquinista getMaquinista() {
		return maquinista;
	}

	public void setMaquinista(Maquinista maquinista) {
		this.maquinista = maquinista;
	}

	@Override
	public String toString() {
		return "Trenes [locomotora=" + locomotora + ", vagones=" + Arrays.toString(vagones) + ", maquinista="
				+ maquinista + "]";
	}

	public Trenes(Locomotoras locomotora, Vagones[] vagones, Maquinista maquinista) {
		super();
		this.locomotora = locomotora;
		this.vagones = vagones;
		this.maquinista = maquinista;
	}

	public Trenes() {
		super();
	}

}
