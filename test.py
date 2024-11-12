from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from webdriver_manager.chrome import ChromeDriverManager
from selenium.webdriver.common.keys import Keys
import time

def abrir_navegador():
    # Usando o ChromeDriverManager para gerenciar o chromedriver
    service = Service(ChromeDriverManager().install())
    driver = webdriver.Chrome(service=service)
    return driver

def abrir_google(driver):
    driver.get('https://www.google.com')
    assert "Google" in driver.title  # Verifica se o Google foi carregado corretamente

def escrever_na_pesquisa(driver, frase):
    # Encontrar o campo de pesquisa do Google pelo nome "q"
    campo_busca = driver.find_element('name', 'q')
    
    # Escrever a frase na barra de pesquisa
    campo_busca.send_keys(frase)
    
    # Pressionar "Enter" para realizar a pesquisa (opcional)
    campo_busca.send_keys(Keys.RETURN)

def fechar_navegador(driver):
    driver.quit()

# Execução do código
driver = abrir_navegador()  # Inicia o navegador
abrir_google(driver)         # Abre o Google

# Escrever uma frase na barra de pesquisa
escrever_na_pesquisa(driver, "Youtube")


time.sleep(7)

# Fechar o navegador (opcional)
fechar_navegador(driver)