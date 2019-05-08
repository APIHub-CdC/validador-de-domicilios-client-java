package io.apihub.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Respuesta generada por la API verficador de domicilios.")

public class Respuesta {
	@SerializedName("verificado")
	private Boolean verificado = null;

	public Respuesta verificado(Boolean verificado) {
		this.verificado = verificado;
		return this;
	}

	@ApiModelProperty(required = true, value = "Valor booleano que indica si se verificó el domicilio.")
	public Boolean isVerificado() {
		return verificado;
	}

	public void setVerificado(Boolean verificado) {
		this.verificado = verificado;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Respuesta respuesta = (Respuesta) o;
		return Objects.equals(this.verificado, respuesta.verificado);
	}

	@Override
	public int hashCode() {
		return Objects.hash(verificado);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Respuesta {\n");

		sb.append("    verificado: ").append(toIndentedString(verificado)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
