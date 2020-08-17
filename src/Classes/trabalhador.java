package Classes;

import java.util.List;

import Enum.NivelTrabalhador;

import java.util.ArrayList;
import java.util.Calendar;

public class trabalhador {
	private String nome;
	private NivelTrabalhador Cargo;
	private Double salarioBase;

	private departamento departamento;
	private List<HoraContrato> contratos = new ArrayList<>();

	public trabalhador() {
	}

	public trabalhador(String nome, NivelTrabalhador cargo, Double salarioBase, departamento departamento) {
		this.nome = nome;
		this.Cargo = cargo;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelTrabalhador getCargo() {
		return Cargo;
	}

	public void setCargo(NivelTrabalhador cargo) {
		Cargo = cargo;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(departamento departamento) {
		this.departamento = departamento;
	}

	public List<HoraContrato> getContratos() {
		return contratos;
	}

	public void addContrato(HoraContrato contrato) {
		contratos.add(contrato);
	}

	public void remContrato(HoraContrato contrato) {
		contratos.remove(contrato);
	}

	public double renda(int year, int month) {
		double renda = salarioBase;
		Calendar cal = Calendar.getInstance();
		for (HoraContrato c : contratos) {
			cal.setTime(c.getData());
			int x_year = cal.get(Calendar.YEAR);
			int x_month = 1+ cal.get(Calendar.MONTH);
			if (year == x_year && month == x_month) {
				renda += c.valorTotal();
			}

		}
		return renda;
	}

}
