package io.apihub.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.apihub.client.model.Error;
import java.util.ArrayList;
import java.util.List;

@ApiModel(description = "Si existen errores, se listarán.")

public class Errores {
	@SerializedName("errors")
	private List<Error> errors = null;

	public Errores errors(List<Error> errors) {
		this.errors = errors;
		return this;
	}

	public Errores addErrorsItem(Error errorsItem) {
		if (this.errors == null) {
			this.errors = new ArrayList<Error>();
		}
		this.errors.add(errorsItem);
		return this;
	}

	@ApiModelProperty(value = "")
	public List<Error> getErrors() {
		return errors;
	}

	public void setErrors(List<Error> errors) {
		this.errors = errors;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Errores errores = (Errores) o;
		return Objects.equals(this.errors, errores.errors);
	}

	@Override
	public int hashCode() {
		return Objects.hash(errors);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Errores {\n");

		sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
