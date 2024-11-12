const { Builder, By, Key, until } = require('selenium-webdriver');

async function pesquisarNoGoogle() {
    // Inicia o WebDriver e abre o navegador
    let driver = await new Builder().forBrowser('chrome').build();

    try {
        // Navega para o Google
        await driver.get('https://www.google.com');

        // Encontra o campo de pesquisa, insere o termo e pressiona Enter
        await driver.findElement(By.name('q')).sendKeys('Girl A', Key.RETURN);

        // Espera que os resultados estejam visíveis
        await driver.wait(until.elementLocated(By.css('h3')), 20000);

        // Obtém e exibe os títulos dos primeiros resultados
        let results = await driver.findElements(By.css('h3'));
        for (let i = 0; i < results.length; i++) {
            console.log(await results[i].getText());
        }
    } finally {
        // Fecha o navegador
        await driver.quit();
    }
}

pesquisarNoGoogle();
