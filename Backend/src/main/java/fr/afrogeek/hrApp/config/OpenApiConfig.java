package fr.afrogeek.hrApp.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
    info= @Info(
        contact =@Contact(
            name = " Loic Kemayou",
            email = "loic.kemayou@yahoo.com"
        ),
        description = "OPENAPI DOC for HrApplication",
        title = "HrApp",
        version = "1.0"
    ),

    servers = { 
      @Server(description = "LOCAL ENV",
      url = "http://localhost:8080"),
      @Server(description = "PROD ENV")
    }
)
public class OpenApiConfig{
    
}