package com.example.kafka.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//@Entity
//@Table(name = "todo")
@NoArgsConstructor
@AllArgsConstructor
@Data
//@Builder
public class ToDo {
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String description_todo;
    private String priority;
    private String date_todo;
  // @Column(name = "is_deleted")
    private Integer isDeleted;
}
