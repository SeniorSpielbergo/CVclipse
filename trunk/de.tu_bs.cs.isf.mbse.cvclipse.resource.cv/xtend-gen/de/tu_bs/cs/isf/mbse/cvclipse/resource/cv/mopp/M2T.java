package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp;

import com.google.common.base.Objects;
import de.tu_bs.cs.isf.mbse.cvclipse.Application;
import de.tu_bs.cs.isf.mbse.cvclipse.Block;
import de.tu_bs.cs.isf.mbse.cvclipse.CV;
import de.tu_bs.cs.isf.mbse.cvclipse.Color;
import de.tu_bs.cs.isf.mbse.cvclipse.Date;
import de.tu_bs.cs.isf.mbse.cvclipse.DateItem;
import de.tu_bs.cs.isf.mbse.cvclipse.Item;
import de.tu_bs.cs.isf.mbse.cvclipse.ItemBlock;
import de.tu_bs.cs.isf.mbse.cvclipse.Language;
import de.tu_bs.cs.isf.mbse.cvclipse.Letter;
import de.tu_bs.cs.isf.mbse.cvclipse.ListBlock;
import de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation;
import de.tu_bs.cs.isf.mbse.cvclipse.Style;
import de.tu_bs.cs.isf.mbse.cvclipse.Text;
import de.tu_bs.cs.isf.mbse.cvclipse.TextItem;
import de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.ModelLoader;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.IntegerRange;

@SuppressWarnings("all")
public class M2T {
  public Object M2T() {
    return null;
  }
  
  private String DEFAULT_STYLE = "casual";
  
  private String DEFAULT_COLOR = "blue";
  
  private String GERMAN_OPENING = "Sehr geehrte Damen und Herren";
  
  private String ENGLISH_OPENING = "Dear Sir or Madam";
  
  private String FRENCH_OPENING = "Mesdames, Messieurs";
  
  private String SPANISH_OPENING = "Muy señores míos";
  
  private String GERMAN_CLOSING = "Mit freundlichen Grüßen";
  
  private String ENGLISH_CLOSING = "Yours sincerly";
  
  private String FRENCH_CLOSING = "Je vous adresse, Madame, Monsieur, mes salutations distinguées";
  
  private String SPANISH_CLOSING = "Le saluda atentamente";
  
  private String GERMAN_PERSONAL = "Angaben zur Person";
  
  private String ENGLISH_PERSONAL = "Personal Information";
  
  private String SPANISH_PERSONAL = "Información Personal";
  
  private String FRENCH_PERSONAL = "Information Personelle";
  
  private String GERMAN_NATIONALITY = "Staatsangehörigkeit";
  
  private String ENGLISH_NATIONALITY = "Nationality";
  
  private String FRENCH_NATIONALITY = "Nationalité";
  
  private String SPANISH_NATIONALITY = "Nacionalidad";
  
  private String GERMAN_BIRTHDATE = "Geburtsdatum";
  
  private String ENGLISH_BIRTHDATE = "Birthdate";
  
  private String SPANISH_BIRTHDATE = "Fecha de Nacimiento";
  
  private String FRENCH_BIRTHDATE = "Date de Naissance";
  
  private String GERMAN_BIRTHPLACE = "Geburtsort";
  
  private String ENGLISH_BIRTHPLACE = "Birthplace";
  
  private String SPANISH_BIRTHPLACE = "Lugar de Nacimiento";
  
  private String FRENCH_BIRTHPLACE = "Lieu de Naissance";
  
  private String GERMAN_SINCE = "seit";
  
  private String ENGLISH_SINCE = "since";
  
  private String FRENCH_SINCE = "depuis";
  
  private String SPANISH_SINCE = "deste";
  
  private ModelLoader m = new Function0<ModelLoader>() {
    public ModelLoader apply() {
      ModelLoader _modelLoader = new ModelLoader();
      return _modelLoader;
    }
  }.apply();
  
  private Application app;
  
  private List<Language> languages;
  
  private File targetFile;
  
  private FileOutputStream streamy;
  
  private String output;
  
  public void generate(final String folder, final String fileName) {
    try {
      Application _loadModel = this.m.loadModel(folder, fileName);
      this.app = _loadModel;
      EList<Language> _languages = this.app.getLanguages();
      this.languages = _languages;
      for (final Language l : this.languages) {
        {
          String _name = l.getName();
          String _lowerCase = _name.toLowerCase();
          String _plus = ((((folder + File.separator) + fileName) + "_") + _lowerCase);
          String _plus_1 = (_plus + ".tex");
          File _file = new File(_plus_1);
          this.targetFile = _file;
          this.targetFile.createNewFile();
          FileOutputStream _fileOutputStream = new FileOutputStream(this.targetFile);
          this.streamy = _fileOutputStream;
          String _generateContents = this.generateContents(l);
          String _replaceAll = _generateContents.replaceAll("\"", "");
          this.output = _replaceAll;
          byte[] _bytes = this.output.getBytes();
          this.streamy.write(_bytes);
          this.streamy.close();
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String generateContents(final Language language) {
    StringConcatenation _builder = new StringConcatenation();
    String _generateHead = this.generateHead(language);
    _builder.append(_generateHead, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generatePersonal = this.generatePersonal(language);
    _builder.append(_generatePersonal, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\\setlength{\\hintscolumnwidth}{4.5cm}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\begin{document}");
    _builder.newLine();
    {
      Letter _letter = this.app.getLetter();
      boolean _notEquals = (!Objects.equal(_letter, null));
      if (_notEquals) {
        String _generateLetter = this.generateLetter(language);
        _builder.append(_generateLetter, "");
      }
    }
    _builder.newLineIfNotEmpty();
    String _generateCv = this.generateCv(language);
    _builder.append(_generateCv, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\\end{document}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String generateHead(final Language language) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\documentclass[12pt,a4paper,sans]{moderncv}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\usepackage[utf8]{inputenc}");
    _builder.newLine();
    _builder.append("\\usepackage[T1]{fontenc}");
    _builder.newLine();
    _builder.append("\\usepackage[");
    String _literal = language.getLiteral();
    _builder.append(_literal, "");
    _builder.append("]{babel}");
    _builder.newLineIfNotEmpty();
    _builder.append("\\usepackage[scale=0.75]{geometry}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\moderncvstyle{");
    {
      Style _style = this.app.getStyle();
      boolean _equals = Objects.equal(_style, null);
      if (_equals) {
        _builder.append(this.DEFAULT_STYLE, "");
      } else {
        Style _style_1 = this.app.getStyle();
        String _literal_1 = _style_1.getLiteral();
        _builder.append(_literal_1, "");
      }
    }
    _builder.append("}");
    _builder.newLineIfNotEmpty();
    _builder.append("\\moderncvcolor{");
    {
      Color _color = this.app.getColor();
      boolean _equals_1 = Objects.equal(_color, null);
      if (_equals_1) {
        _builder.append(this.DEFAULT_COLOR, "");
      } else {
        Color _color_1 = this.app.getColor();
        String _literal_2 = _color_1.getLiteral();
        _builder.append(_literal_2, "");
      }
    }
    _builder.append("}");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String generatePersonal(final Language languages) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\name{");
    PersonalInformation _personalInformation = this.app.getPersonalInformation();
    String _firstname = _personalInformation.getFirstname();
    _builder.append(_firstname, "");
    _builder.append("}{");
    PersonalInformation _personalInformation_1 = this.app.getPersonalInformation();
    String _surname = _personalInformation_1.getSurname();
    _builder.append(_surname, "");
    _builder.append("}");
    _builder.newLineIfNotEmpty();
    _builder.append("\\address{");
    PersonalInformation _personalInformation_2 = this.app.getPersonalInformation();
    String _street = _personalInformation_2.getStreet();
    _builder.append(_street, "");
    _builder.append("}{");
    PersonalInformation _personalInformation_3 = this.app.getPersonalInformation();
    String _city = _personalInformation_3.getCity();
    _builder.append(_city, "");
    _builder.append("}");
    _builder.newLineIfNotEmpty();
    {
      PersonalInformation _personalInformation_4 = this.app.getPersonalInformation();
      String _phone = _personalInformation_4.getPhone();
      boolean _notEquals = (!Objects.equal(_phone, null));
      if (_notEquals) {
        _builder.append("\\phone[fixed]{");
        PersonalInformation _personalInformation_5 = this.app.getPersonalInformation();
        String _phone_1 = _personalInformation_5.getPhone();
        _builder.append(_phone_1, "");
        _builder.append("}");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      PersonalInformation _personalInformation_6 = this.app.getPersonalInformation();
      String _mobile = _personalInformation_6.getMobile();
      boolean _notEquals_1 = (!Objects.equal(_mobile, null));
      if (_notEquals_1) {
        _builder.append("\\phone[mobile]{");
        PersonalInformation _personalInformation_7 = this.app.getPersonalInformation();
        String _mobile_1 = _personalInformation_7.getMobile();
        _builder.append(_mobile_1, "");
        _builder.append("}");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      PersonalInformation _personalInformation_8 = this.app.getPersonalInformation();
      String _fax = _personalInformation_8.getFax();
      boolean _notEquals_2 = (!Objects.equal(_fax, null));
      if (_notEquals_2) {
        _builder.append("\\phone[fax]{");
        PersonalInformation _personalInformation_9 = this.app.getPersonalInformation();
        String _fax_1 = _personalInformation_9.getFax();
        _builder.append(_fax_1, "");
        _builder.append("}");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      PersonalInformation _personalInformation_10 = this.app.getPersonalInformation();
      String _email = _personalInformation_10.getEmail();
      boolean _notEquals_3 = (!Objects.equal(_email, null));
      if (_notEquals_3) {
        _builder.append("\\email{");
        PersonalInformation _personalInformation_11 = this.app.getPersonalInformation();
        String _email_1 = _personalInformation_11.getEmail();
        _builder.append(_email_1, "");
        _builder.append("}");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      PersonalInformation _personalInformation_12 = this.app.getPersonalInformation();
      String _website = _personalInformation_12.getWebsite();
      boolean _notEquals_4 = (!Objects.equal(_website, null));
      if (_notEquals_4) {
        _builder.append("\\homepage{");
        PersonalInformation _personalInformation_13 = this.app.getPersonalInformation();
        String _website_1 = _personalInformation_13.getWebsite();
        _builder.append(_website_1, "");
        _builder.append("}");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      PersonalInformation _personalInformation_14 = this.app.getPersonalInformation();
      String _linkedIn = _personalInformation_14.getLinkedIn();
      boolean _notEquals_5 = (!Objects.equal(_linkedIn, null));
      if (_notEquals_5) {
        _builder.append("\\social[linkedin]{");
        PersonalInformation _personalInformation_15 = this.app.getPersonalInformation();
        String _linkedIn_1 = _personalInformation_15.getLinkedIn();
        _builder.append(_linkedIn_1, "");
        _builder.append("}");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      PersonalInformation _personalInformation_16 = this.app.getPersonalInformation();
      String _twitter = _personalInformation_16.getTwitter();
      boolean _notEquals_6 = (!Objects.equal(_twitter, null));
      if (_notEquals_6) {
        _builder.append("\\social[twitter]{");
        PersonalInformation _personalInformation_17 = this.app.getPersonalInformation();
        String _twitter_1 = _personalInformation_17.getTwitter();
        _builder.append(_twitter_1, "");
        _builder.append("}");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      PersonalInformation _personalInformation_18 = this.app.getPersonalInformation();
      String _github = _personalInformation_18.getGithub();
      boolean _notEquals_7 = (!Objects.equal(_github, null));
      if (_notEquals_7) {
        _builder.append("\\social[github]{");
        PersonalInformation _personalInformation_19 = this.app.getPersonalInformation();
        String _github_1 = _personalInformation_19.getGithub();
        _builder.append(_github_1, "");
        _builder.append("}");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      CV _cv = this.app.getCv();
      String _picture = _cv.getPicture();
      boolean _notEquals_8 = (!Objects.equal(_picture, null));
      if (_notEquals_8) {
        _builder.append("\\photo[64pt][0.4pt]{");
        CV _cv_1 = this.app.getCv();
        String _picture_1 = _cv_1.getPicture();
        _builder.append(_picture_1, "");
        _builder.append("}");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String generateLetter(final Language languages) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\recipient{");
    {
      Letter _letter = this.app.getLetter();
      String _recipientAttention = _letter.getRecipientAttention();
      boolean _notEquals = (!Objects.equal(_recipientAttention, null));
      if (_notEquals) {
        Letter _letter_1 = this.app.getLetter();
        String _recipientAttention_1 = _letter_1.getRecipientAttention();
        _builder.append(_recipientAttention_1, "");
      }
    }
    _builder.append("}{");
    Letter _letter_2 = this.app.getLetter();
    String _recipientCompany = _letter_2.getRecipientCompany();
    _builder.append(_recipientCompany, "");
    _builder.append("\\\\");
    Letter _letter_3 = this.app.getLetter();
    String _recipientStreet = _letter_3.getRecipientStreet();
    _builder.append(_recipientStreet, "");
    _builder.append("\\\\");
    Letter _letter_4 = this.app.getLetter();
    String _recipientCity = _letter_4.getRecipientCity();
    _builder.append(_recipientCity, "");
    {
      Letter _letter_5 = this.app.getLetter();
      String _recipientCountry = _letter_5.getRecipientCountry();
      boolean _notEquals_1 = (!Objects.equal(_recipientCountry, null));
      if (_notEquals_1) {
        _builder.append("\\\\");
        Letter _letter_6 = this.app.getLetter();
        String _recipientCountry_1 = _letter_6.getRecipientCountry();
        _builder.append(_recipientCountry_1, "");
      }
    }
    _builder.append("}");
    _builder.newLineIfNotEmpty();
    _builder.append("\\date{");
    {
      Date _date = this.app.getDate();
      boolean _notEquals_2 = (!Objects.equal(_date, null));
      if (_notEquals_2) {
        Date _date_1 = this.app.getDate();
        _builder.append(_date_1, "");
      } else {
        _builder.append("\\today");
      }
    }
    _builder.append("}");
    _builder.newLineIfNotEmpty();
    _builder.append("\\opening{");
    {
      Letter _letter_7 = this.app.getLetter();
      EMap<Language,Text> _opening = _letter_7.getOpening();
      boolean _isEmpty = _opening.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        Letter _letter_8 = this.app.getLetter();
        EMap<Language,Text> _opening_1 = _letter_8.getOpening();
        Text _get = _opening_1.get(languages);
        _builder.append(_get, "");
      } else {
        boolean _equals = languages.equals(Language.ENGLISH);
        if (_equals) {
          _builder.append(this.ENGLISH_OPENING, "");
        } else {
          boolean _equals_1 = languages.equals(Language.GERMAN);
          if (_equals_1) {
            _builder.append(this.GERMAN_OPENING, "");
          } else {
            boolean _equals_2 = languages.equals(Language.SPANISH);
            if (_equals_2) {
              _builder.append(this.SPANISH_OPENING, "");
            } else {
              boolean _equals_3 = languages.equals(Language.FRENCH);
              if (_equals_3) {
                _builder.append(this.FRENCH_OPENING, "");
              }
            }
          }
        }
      }
    }
    _builder.append(",}");
    _builder.newLineIfNotEmpty();
    _builder.append("\\closing{");
    {
      Letter _letter_9 = this.app.getLetter();
      EMap<Language,Text> _closing = _letter_9.getClosing();
      boolean _isEmpty_1 = _closing.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        Letter _letter_10 = this.app.getLetter();
        EMap<Language,Text> _closing_1 = _letter_10.getClosing();
        Text _get_1 = _closing_1.get(languages);
        _builder.append(_get_1, "");
      } else {
        boolean _equals_4 = languages.equals(Language.ENGLISH);
        if (_equals_4) {
          _builder.append(this.ENGLISH_CLOSING, "");
        } else {
          boolean _equals_5 = languages.equals(Language.GERMAN);
          if (_equals_5) {
            _builder.append(this.GERMAN_CLOSING, "");
          } else {
            boolean _equals_6 = languages.equals(Language.SPANISH);
            if (_equals_6) {
              _builder.append(this.SPANISH_CLOSING, "");
            } else {
              boolean _equals_7 = languages.equals(Language.FRENCH);
              if (_equals_7) {
                _builder.append(this.FRENCH_CLOSING, "");
              }
            }
          }
        }
      }
    }
    _builder.append(",}");
    _builder.newLineIfNotEmpty();
    {
      Letter _letter_11 = this.app.getLetter();
      EMap<Language,Text> _enclosure = _letter_11.getEnclosure();
      boolean _isEmpty_2 = _enclosure.isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        _builder.append("\\enclosure{");
        Letter _letter_12 = this.app.getLetter();
        EMap<Language,Text> _enclosure_1 = _letter_12.getEnclosure();
        Text _get_2 = _enclosure_1.get(languages);
        _builder.append(_get_2, "");
        _builder.append("}");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\\makelettertitle");
    _builder.newLine();
    Letter _letter_13 = this.app.getLetter();
    EMap<Language,Text> _text = _letter_13.getText();
    Text _get_3 = _text.get(languages);
    _builder.append(_get_3, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\\makeletterclosing");
    _builder.newLine();
    _builder.append("\\clearpage");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String generateCv(final Language languages) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\makecvtitle");
    _builder.newLine();
    _builder.append("\\section{");
    {
      boolean _equals = languages.equals(Language.ENGLISH);
      if (_equals) {
        _builder.append(this.ENGLISH_PERSONAL, "");
      } else {
        boolean _equals_1 = languages.equals(Language.GERMAN);
        if (_equals_1) {
          _builder.append(this.GERMAN_PERSONAL, "");
        } else {
          boolean _equals_2 = languages.equals(Language.SPANISH);
          if (_equals_2) {
            _builder.append(this.SPANISH_PERSONAL, "");
          } else {
            boolean _equals_3 = languages.equals(Language.FRENCH);
            if (_equals_3) {
              _builder.append(this.FRENCH_PERSONAL, "");
            }
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLineIfNotEmpty();
    {
      PersonalInformation _personalInformation = this.app.getPersonalInformation();
      EMap<Language,Text> _nationality = _personalInformation.getNationality();
      boolean _isEmpty = _nationality.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("\\cvitem{\\textbf{");
        {
          boolean _equals_4 = languages.equals(Language.ENGLISH);
          if (_equals_4) {
            _builder.append(this.ENGLISH_NATIONALITY, "");
          } else {
            boolean _equals_5 = languages.equals(Language.GERMAN);
            if (_equals_5) {
              _builder.append(this.GERMAN_NATIONALITY, "");
            } else {
              boolean _equals_6 = languages.equals(Language.SPANISH);
              if (_equals_6) {
                _builder.append(this.SPANISH_NATIONALITY, "");
              } else {
                boolean _equals_7 = languages.equals(Language.FRENCH);
                if (_equals_7) {
                  _builder.append(this.FRENCH_NATIONALITY, "");
                }
              }
            }
          }
        }
        _builder.append("}}{");
        PersonalInformation _personalInformation_1 = this.app.getPersonalInformation();
        EMap<Language,Text> _nationality_1 = _personalInformation_1.getNationality();
        Text _get = _nationality_1.get(languages);
        _builder.append(_get, "");
        _builder.append("}");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\\cvitem{\\textbf{");
    {
      boolean _equals_8 = languages.equals(Language.ENGLISH);
      if (_equals_8) {
        _builder.append(this.ENGLISH_BIRTHDATE, "");
      } else {
        boolean _equals_9 = languages.equals(Language.GERMAN);
        if (_equals_9) {
          _builder.append(this.GERMAN_BIRTHDATE, "");
        } else {
          boolean _equals_10 = languages.equals(Language.SPANISH);
          if (_equals_10) {
            _builder.append(this.SPANISH_BIRTHDATE, "");
          } else {
            boolean _equals_11 = languages.equals(Language.FRENCH);
            if (_equals_11) {
              _builder.append(this.FRENCH_BIRTHDATE, "");
            }
          }
        }
      }
    }
    _builder.append("}}{");
    PersonalInformation _personalInformation_2 = this.app.getPersonalInformation();
    Date _birthdate = _personalInformation_2.getBirthdate();
    _builder.append(_birthdate, "");
    _builder.append("}");
    _builder.newLineIfNotEmpty();
    _builder.append("\\cvitem{\\textbf{");
    {
      boolean _equals_12 = languages.equals(Language.ENGLISH);
      if (_equals_12) {
        _builder.append(this.ENGLISH_BIRTHPLACE, "");
      } else {
        boolean _equals_13 = languages.equals(Language.GERMAN);
        if (_equals_13) {
          _builder.append(this.GERMAN_BIRTHPLACE, "");
        } else {
          boolean _equals_14 = languages.equals(Language.SPANISH);
          if (_equals_14) {
            _builder.append(this.SPANISH_BIRTHPLACE, "");
          } else {
            boolean _equals_15 = languages.equals(Language.FRENCH);
            if (_equals_15) {
              _builder.append(this.FRENCH_BIRTHPLACE, "");
            }
          }
        }
      }
    }
    _builder.append("}}{");
    PersonalInformation _personalInformation_3 = this.app.getPersonalInformation();
    String _birthplace = _personalInformation_3.getBirthplace();
    _builder.append(_birthplace, "");
    _builder.append("}");
    _builder.newLineIfNotEmpty();
    {
      CV _cv = this.app.getCv();
      EList<Block> _blocks = _cv.getBlocks();
      for(final Block block : _blocks) {
        _builder.append("\\section{");
        EMap<Language,Text> _title = block.getTitle();
        Text _get_1 = _title.get(languages);
        _builder.append(_get_1, "");
        _builder.append("}");
        _builder.newLineIfNotEmpty();
        {
          if ((block instanceof ListBlock)) {
            {
              EList<Item> _items = ((ListBlock)block).getItems();
              int _size = _items.size();
              int _minus = (_size - 1);
              IntegerRange _upTo = new IntegerRange(0, _minus);
              for(final Integer i : _upTo) {
                {
                  if ((((i).intValue() % 2) == 0)) {
                    _builder.append("\\cvdoubleitem{\\textbf{");
                    EList<Item> _items_1 = ((ListBlock)block).getItems();
                    Item _get_2 = _items_1.get((i).intValue());
                    EMap<Language,Text> _leftContent = ((TextItem) _get_2).getLeftContent();
                    Text _get_3 = _leftContent.get(languages);
                    _builder.append(_get_3, "");
                    _builder.append("}}{");
                    EList<Item> _items_2 = ((ListBlock)block).getItems();
                    Item _get_4 = _items_2.get((i).intValue());
                    EMap<Language,Text> _rightContent = _get_4.getRightContent();
                    Text _get_5 = _rightContent.get(languages);
                    _builder.append(_get_5, "");
                    _builder.append("}");
                    {
                      EList<Item> _items_3 = ((ListBlock)block).getItems();
                      int _size_1 = _items_3.size();
                      boolean _greaterThan = (_size_1 > ((i).intValue() + 1));
                      if (_greaterThan) {
                        _builder.append("{\\textbf{");
                        EList<Item> _items_4 = ((ListBlock)block).getItems();
                        Item _get_6 = _items_4.get(((i).intValue() + 1));
                        EMap<Language,Text> _leftContent_1 = ((TextItem) _get_6).getLeftContent();
                        Text _get_7 = _leftContent_1.get(languages);
                        _builder.append(_get_7, "");
                        _builder.append("}}{");
                        EList<Item> _items_5 = ((ListBlock)block).getItems();
                        Item _get_8 = _items_5.get(((i).intValue() + 1));
                        EMap<Language,Text> _rightContent_1 = _get_8.getRightContent();
                        Text _get_9 = _rightContent_1.get(languages);
                        _builder.append(_get_9, "");
                        _builder.append("}");
                      } else {
                        _builder.append("{}{}");
                      }
                    }
                  }
                }
              }
            }
            _builder.newLineIfNotEmpty();
          } else {
            if ((block instanceof ItemBlock)) {
              {
                EList<Item> _items_6 = block.getItems();
                for(final Item item : _items_6) {
                  _builder.append("\\cvitem{");
                  {
                    if ((item instanceof TextItem)) {
                      _builder.append("\\textbf{");
                      EMap<Language,Text> _leftContent_2 = ((TextItem) item).getLeftContent();
                      Text _get_10 = _leftContent_2.get(languages);
                      _builder.append(_get_10, "");
                      _builder.append("}");
                    }
                  }
                  {
                    if ((item instanceof DateItem)) {
                      {
                        Date _end = ((DateItem) item).getEnd();
                        boolean _notEquals = (!Objects.equal(_end, null));
                        if (_notEquals) {
                          Date _begin = ((DateItem) item).getBegin();
                          String _string = _begin.toString();
                          _builder.append(_string, "");
                          _builder.append(" -- ");
                          Date _end_1 = ((DateItem) item).getEnd();
                          String _string_1 = _end_1.toString();
                          _builder.append(_string_1, "");
                        } else {
                          {
                            boolean _equals_16 = languages.equals(Language.ENGLISH);
                            if (_equals_16) {
                              _builder.append(this.ENGLISH_SINCE, "");
                            } else {
                              boolean _equals_17 = languages.equals(Language.GERMAN);
                              if (_equals_17) {
                                _builder.append(this.GERMAN_SINCE, "");
                              } else {
                                boolean _equals_18 = languages.equals(Language.SPANISH);
                                if (_equals_18) {
                                  _builder.append(this.SPANISH_SINCE, "");
                                } else {
                                  boolean _equals_19 = languages.equals(Language.FRENCH);
                                  if (_equals_19) {
                                    _builder.append(this.FRENCH_SINCE, "");
                                  }
                                }
                              }
                            }
                          }
                          _builder.append(" ");
                          Date _begin_1 = ((DateItem) item).getBegin();
                          String _string_2 = _begin_1.toString();
                          _builder.append(_string_2, "");
                        }
                      }
                    }
                  }
                  _builder.append("}{");
                  EMap<Language,Text> _rightContent_2 = item.getRightContent();
                  Text _get_11 = _rightContent_2.get(languages);
                  _builder.append(_get_11, "");
                  _builder.append("}");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("\\emptysection \\closesection \\vspace{4cm}");
    _builder.newLine();
    String _place = this.app.getPlace();
    _builder.append(_place, "");
    _builder.append(", ");
    {
      Date _date = this.app.getDate();
      boolean _notEquals_1 = (!Objects.equal(_date, null));
      if (_notEquals_1) {
        Date _date_1 = this.app.getDate();
        String _string_3 = _date_1.toString();
        _builder.append(_string_3, "");
      } else {
        _builder.append("\\today");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
}
