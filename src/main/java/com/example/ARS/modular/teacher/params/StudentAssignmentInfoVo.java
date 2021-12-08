package com.example.ARS.modular.teacher.params;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentAssignmentInfoVo {
    @ApiModelProperty(value = "Assignment id")
    private Long id;

    @ApiModelProperty(value = "Assignment name")
    private String name;

    @ApiModelProperty(value = "Assignment description")
    private String description;

    @ApiModelProperty(value = "Assignment due date")
    private String dueDate;

    @ApiModelProperty(value = "Creator's name")
    private String teacherName;

    @ApiModelProperty(value = "Assignment status")
    private Integer status;

    @ApiModelProperty(value = "Enrolment status")
    private Integer enrolment_status;

    @ApiModelProperty(value = "Submission URL")
    private String fileKey;
}
