package br.com.developeralexandresantos.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NumberToWordsResponseType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-10-20T02:26:42.096-03:00[America/Sao_Paulo]")
public class NumberToWordsResponseType   {
  @JsonProperty("resultado")
  private String resultado = null;

  public NumberToWordsResponseType resultado(String resultado) {
    this.resultado = resultado;
    return this;
  }

  /**
   * Get resultado
   * @return resultado
  **/
  @ApiModelProperty(value = "")

  public String getResultado() {
    return resultado;
  }

  public void setResultado(String resultado) {
    this.resultado = resultado;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumberToWordsResponseType numberToWordsResponseType = (NumberToWordsResponseType) o;
    return Objects.equals(this.resultado, numberToWordsResponseType.resultado);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultado);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberToWordsResponseType {\n");
    
    sb.append("    resultado: ").append(toIndentedString(resultado)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
