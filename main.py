import random
import time
from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By

chrome_driver_path = "chromedriver.exe" 

service = Service(chrome_driver_path)

driver = webdriver.Chrome(service=service)

try:
    driver.get("https://www.google.com")

    time.sleep(3)

    search_box = driver.find_element(By.NAME, "q")

    search_terms = ["Selenium Python", "OpenAI ChatGPT", "Weather today", "Latest news", "Python programming"]

    random_search_term = random.choice(search_terms)
    print(f"Pesquisando por: {random_search_term}")

    search_box.send_keys(random_search_term)

    search_box.send_keys(Keys.RETURN)

    time.sleep(5)

finally:
    driver.quit()
