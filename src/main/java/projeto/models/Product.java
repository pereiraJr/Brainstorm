package projeto.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import projeto.models.Category;

@Entity
@Table(name="produto")
public class Product
{

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
   
   @Column(name="nome")
   private String name;
   @Column(name="descricao")
   private String description;
   @Column(name="preco")
   private BigDecimal price;
   @ManyToOne
   private Category category;

   public Integer getId()
   {
      return this.id;
   }

   public void setId(Integer id)
   {
      this.id = id;
   }

   public String getName()
   {
      return this.name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public String getDescription()
   {
      return this.description;
   }

   public void setDescription(String description)
   {
      this.description = description;
   }

   public BigDecimal getPrice()
   {
      return this.price;
   }

   public void setPrice(BigDecimal price)
   {
      this.price = price;
   }

   public Category getCategory()
   {
      return this.category;
   }

   public void setCategory(Category category)
   {
      this.category = category;
   }
}
