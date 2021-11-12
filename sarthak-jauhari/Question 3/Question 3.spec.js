it(`200 response`, () => {
    cy.request({
        method: 'PUT',
        url: 'https://petstore3.swagger.io/api/v3/pet',
        headers: {          
          'Content-Type': 'application/json',             
        },
        body: {
            "id": 10,
            "name": "doggie",
            "category": {
              "id": 1,
              "name": "Dogs"
            },
            "photoUrls": [
              "string"
            ],
            "tags": [
              {
                "id": 0,
                "name": "string"
              }
            ],
            "status": "available"
          }
            
        
      }).as('req');
    
      cy.get('@req').then((response) => {                  
        expect(response.status).to.eq(200);
        expect(response.statusText).to.eq("OK");
        expect(response.body.id).to.eq(10);
        cy.log("Response time is "+response.duration+" ms");
        
    });
})


it(`400 response`, () => {
    cy.request({
        method: 'PUT',
        url: 'https://petstore3.swagger.io/api/v3/pet',
        headers: {          
          'Content-Type': 'application/json',             
        },
        "failOnStatusCode": false,
        body: {
            "id": "abc",
            "name": "doggie",
            "category": {
              "id": 1,
              "name": "Dogs"
            },
            "photoUrls": [
              "string"
            ],
            "tags": [
              {
                "id": 0,
                "name": "string"
              }
            ],
            "status": "available"
          }            
        
      }).as('req');
    
      cy.get('@req').then((response) => {    
        expect(response.status).to.eq(400);
        expect(response.statusText).to.eq("Bad Request");
        expect(response.body.code).to.eq(400);
        expect(response.body.message).to.eq("Input error: unable to convert input to io.swagger.petstore.model.Pet");
        cy.log("Response time is "+response.duration+" ms");
        
    });
})


it(`404 response`, () => {
    cy.request({
        method: 'PUT',
        url: 'https://petstore3.swagger.io/api/v3/pet',
        headers: {          
          'Content-Type': 'application/json',                    
          
        },
        "failOnStatusCode": false,
        body: {
            "id": 91122,
            "name": "doggie",
            "category": {
              "id": 1,
              "name": "Dogs"
            },
            "photoUrls": [
              "string"
            ],
            "tags": [
              {
                "id": 0,
                "name": "string"
              }
            ],
            "status": "available"
          }            
        
      }).as('req');
    
      cy.get('@req').then((response) => {                
        expect(response.status).to.eq(404);
        expect(response.statusText).to.eq("Not Found");
        expect(response.body).to.eq("Pet not found");
        cy.log("Response time is "+response.duration+" ms");
        
    });
})

