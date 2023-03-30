package com.sgambientes.entities.enums;



public enum TipoAmbiente {
	
	TIPO1(0),
	TIPO2(1);
	
	private int code;
	
	private TipoAmbiente(int code) {
		this.code=code;
	}
	
	public int getambienteCode() {
		return code;
	}
	
	public static TipoAmbiente valueOf(int code) {
		for(TipoAmbiente value: TipoAmbiente.values()) {
			if(value.getambienteCode()==code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Código inválido do ambiente");
	}

}
