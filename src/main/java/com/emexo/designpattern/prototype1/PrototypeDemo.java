package com.emexo.designpattern.prototype1;

/**
 * Document Management System (DMS)
 *
 * In an enterprise Document Management System, we often need to duplicate documents with pre-filled metadata,
 * tags, and security permissions. Creating a new document from scratch every time is inefficient,
 * so we use the Prototype Pattern to clone an existing document template.
 *
 * Use Case Explanation
 * 	•	The system has document templates (Invoice, Report, Agreement).
 * 	•	Users can clone a template, modify content, and create a new document.
 * 	•	Instead of creating documents from scratch, we reuse prototypes.
 * 	•	This improves performance and ensures consistency.
 */
public class PrototypeDemo {
    public static void main(String[] args) {
        // Clone Developer
        Employee dev1 = EmployeeRegistry.getEmployee("developer");
        dev1.addCertification("AWS Certified");
        dev1.showDetails();

        // Clone Another Developer
        Employee dev2 = EmployeeRegistry.getEmployee("developer");
        dev2.showDetails();  // Should not contain AWS certification

        // Clone Manager
        Employee manager = EmployeeRegistry.getEmployee("manager");
        manager.showDetails();
    }
}