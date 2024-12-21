package com.example.appointment.system.backend.dto;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

@Data
public class MedicalRecordResponseDTO {
    private UUID id;
    private UUID patientId;
    private UUID doctorId;
    private LocalDate date;
    private LocalTime time;
    private ReportDTO report;

    @Data
    public static class ReportDTO {
        private String patientName;
        private String complaints;
        private String diagnosis;
        private String examinations;
        private String treatment;
    }
}