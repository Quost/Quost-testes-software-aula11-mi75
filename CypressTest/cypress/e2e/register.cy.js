describe('template spec', () => {
  it('passes', () => {
    cy.visit('https://github.com/CarlosCAK')
    cy.get('.js-details-target > .Button-content > .Button-label').click()
    cy.get('.HeaderMenu-link--sign-up').click()
    
  })
})