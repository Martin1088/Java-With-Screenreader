package org.example.bloomrest;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.example.bloomrest.model.Patient;
import org.example.bloomrest.read.ReadCSV;

@Path("/patients")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PatientsResource {
    @Inject
    private ReadCSV readCSV;
    @POST
    public Response addPatient(Patient patient) {
        readCSV.addPatient(patient);
        return Response.ok("Patient is Successfull added!").build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPatients() {
        return Response.ok(readCSV.getPatients()).build();
    }

    @GET
    @Path("/searchById/{extid}")
    public Response getPatient(@PathParam("extid") int extid) {
        Patient result = readCSV.getPatientByExtid(extid);
        return Response.ok(result).build();
    }

    @GET
    @Path("/search")
    public Response searchPatients(@QueryParam("name") String name) {
        if (name == null || name.isEmpty()) {
            return Response.status(Response.Status.BAD_REQUEST).entity("name as parameter is required!").build();
        }
        return Response.ok(readCSV.searchPatientsByName(name)).build();
    }
}