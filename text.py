from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
import time

# Inicializa o driver
driver = webdriver.Chrome()

try:
    # Acessa o YouTube
    driver.get("https://www.youtube.com")

    # Aguarda a página carregar
    time.sleep(2)

    # Localiza o campo de busca e insere uma palavra-chave
    search_box = driver.find_element(By.NAME, "search_query")
    search_box.send_keys("Python tutorial")
    search_box.send_keys(Keys.RETURN)

    # Aguarda os resultados carregarem e localiza o primeiro vídeo
    WebDriverWait(driver, 10).until(EC.presence_of_element_located((By.ID, "video-title")))
    first_video = driver.find_element(By.ID, "video-title")
    first_video.click()

    # Aguarda o vídeo carregar
    time.sleep(3)

    # Clica no botão de inscrição (se disponível)
    WebDriverWait(driver, 10).until(EC.presence_of_element_located((By.XPATH, "//button[contains(@aria-label, 'Inscrever-se')]")))
    subscribe_button = driver.find_element(By.XPATH, "//button[contains(@aria-label, 'Inscrever-se')]")
    subscribe_button.click()
    
    print("Inscrição realizada com sucesso.")

except Exception as e:
    print("Ocorreu um erro:", e)

finally:
    # Fecha o navegador
    driver.quit()
