describe('Fluxo de navegação no GitHub', () => {
  it('Acessa o perfil e o primeiro repositório', () => {
    cy.visit('https://github.com/viniciusmurara')
    cy.wait(3000)

    cy.get('.mt-4.position-sticky > .container-xl > .Layout > .Layout-main > .UnderlineNav > .UnderlineNav-body > [data-hydro-click-hmac="a0759940d72b79bc39c1742b185e5d7537a7a57db00dc2fa2f94c8c14ff8011a"]').click()
    cy.wait(3000)

    cy.get(':nth-child(1) > .col-10 > .d-inline-block > .wb-break-all > a').click()
    cy.wait(3000)

    cy.get('#folder-row-2 > .react-directory-row-name-cell-large-screen > .react-directory-filename-column > .overflow-hidden > .react-directory-filename-cell > .react-directory-truncate > .Link--primary').click()
  })
})