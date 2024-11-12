import random
import time
from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By

# Defina o caminho para o seu ChromeDriver
chrome_driver_path = "chromedriver.exe"  # Atualize este caminho se necessário

# Configuração do serviço do ChromeDriver
service = Service(chrome_driver_path)

# Inicialize o navegador Chrome
driver = webdriver.Chrome(service=service)

try:
    # Abra o Google
    driver.get("https://www.google.com")

    # Aguarde alguns segundos para garantir que a página carregue completamente
    time.sleep(3)

    # Encontre a barra de pesquisa do Google
    search_box = driver.find_element(By.NAME, "q")

    # Lista de termos de pesquisa aleatórios
    search_terms = ["Selenium Python", "OpenAI ChatGPT", "Weather today", "Latest news", "Python programming"]

    # Escolha um termo de pesquisa aleatório
    random_search_term = random.choice(search_terms)
    print(f"Pesquisando por: {random_search_term}")

    # Digite o termo de pesquisa na barra de pesquisa
    search_box.send_keys(random_search_term)

    # Pressione Enter para realizar a pesquisa
    search_box.send_keys(Keys.RETURN)

    # Aguarde alguns segundos para garantir que os resultados da pesquisa carreguem
    time.sleep(5)

finally:
    # Feche o navegador
    driver.quit()
